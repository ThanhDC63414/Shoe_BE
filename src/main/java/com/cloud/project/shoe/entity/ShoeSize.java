package com.cloud.project.shoe.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "shoe_size")
public class ShoeSize implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GenericGenerator(name = "generator", strategy = "native")
    @GeneratedValue(generator = "generator", strategy= GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, cascade = { CascadeType.MERGE })
    @JoinColumn(name = "shoe_id", referencedColumnName = "id", nullable = false)
    private Shoe shoe;

    @ManyToOne(fetch = FetchType.LAZY, cascade = { CascadeType.MERGE })
    @JoinColumn(name = "size_id", referencedColumnName = "id", nullable = false)
    private Size size;

    @Column(name = "price", nullable = false)
    private Float price;

    @OneToMany(mappedBy = "shoeSize", cascade = { CascadeType.MERGE, CascadeType.PERSIST })
    private Collection<OrderDetail> orderDetails;

}
