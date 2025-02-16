package org.jav.facturacion.modelo;

import java.time.*;
import java.util.*;

import javax.persistence.*;
import javax.persistence.Entity;

import org.hibernate.annotations.*;
import org.jav.facturacion.calculadores.*;
import org.openxava.annotations.*;
import org.openxava.calculators.*;

import lombok.*;

@View(members = "anyo, numero, fecha, cliente, detalles, observaciones")
@Entity @Getter @Setter
public class Factura {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @Hidden
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Column(length = 32)
    String oid;

    @DefaultValueCalculator(CurrentYearCalculator.class)
    @Column(length = 4)
    int anyo;

    @Column(length = 6)
    @DefaultValueCalculator(value = CalculadorSiguienteNumeroParaAnyo.class,
    properties = @PropertyValue(name = "anyo"))
    int numero;

    @Required
    @DefaultValueCalculator(CurrentLocalDateCalculator.class)
    LocalDate fecha;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    Cliente cliente;

    @ElementCollection
    @ListProperties("producto.numero, producto.description, cantidad")
    private Collection<Detalle> detalles;

    @Stereotype("MEMO")
    String observaciones;
}
