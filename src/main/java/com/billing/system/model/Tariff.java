package com.billing.system.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "tariff")
public class Tariff {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank
    @Column(name = "name")
    private String name;

    @NotBlank
    @Column(name = "price")
    private Long price;

    @NotBlank
    @Column(name = "minutes")
    private Long minutes;

    @NotBlank
    @Column(name = "messages")
    private Long messages;

    @NotBlank
    @Column(name = "traffic")
    private Long traffic;

//    public Tariff() {
//    }
//
//    public Tariff(
//            Long id, @NotBlank String name, @NotBlank Long price,
//            @NotBlank Long minutes, @NotBlank Long messages, @NotBlank Long traffic
//    ) {
//        this.id = id;
//        this.name = name;
//        this.price = price;
//        this.minutes = minutes;
//        this.messages = messages;
//        this.traffic = traffic;
//    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getMinutes() {
        return minutes;
    }

    public void setMinutes(Long minutes) {
        this.minutes = minutes;
    }

    public Long getMessages() {
        return messages;
    }

    public void setMessages(Long messages) {
        this.messages = messages;
    }

    public Long getTraffic() {
        return traffic;
    }

    public void setTraffic(Long traffic) {
        this.traffic = traffic;
    }
}
