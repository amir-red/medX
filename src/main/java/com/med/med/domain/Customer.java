package com.med.med.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(uniqueConstraints={@UniqueConstraint(columnNames = {"vertile_id" , "presta_shop_id"})})
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @NotNull
    @Column(name = "vertile_id")
    private String vertileId;

    @Column(name = "presta_shop_id")
    private String prestaShopId;

    public long getId() {
        return id;
    }

    public void Id(long id) {
        this.id = id;
    }

    public String getVertileId() {
        return vertileId;
    }

    public void setVertileId(String vertileId) {
        this.vertileId = vertileId;
    }

    public String getPrestashopId() {
        return prestaShopId;
    }

    public void setPrestashopId(String prestashopId) {
        this.prestaShopId = prestashopId;
    }
}
