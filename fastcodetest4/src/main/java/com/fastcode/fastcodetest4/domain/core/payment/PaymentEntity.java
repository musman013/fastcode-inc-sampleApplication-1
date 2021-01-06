package com.fastcode.fastcodetest4.domain.core.payment;

import javax.persistence.*;
import java.time.*;
import java.math.BigDecimal;
import com.fastcode.fastcodetest4.domain.core.rental.RentalEntity;
import com.fastcode.fastcodetest4.domain.core.staff.StaffEntity;
import com.fastcode.fastcodetest4.domain.core.customer.CustomerEntity;
import com.fastcode.fastcodetest4.domain.core.abstractentity.AbstractEntity;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "PAYMENT")
@Getter @Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
public class PaymentEntity extends AbstractEntity {

    @Basic
    @Column(name = "amount", nullable = false)
    private BigDecimal amount;
    
    @Id
    @EqualsAndHashCode.Include()
    @Column(name = "PAYMENT_ID", nullable = false)
    private Integer paymentId;
    
    @Basic
    @Column(name = "PAYMENT_DATE", nullable = false)
    private LocalDateTime paymentDate;

    @ManyToOne
    @JoinColumn(name = "STAFF_ID")
    private StaffEntity staff;

    @ManyToOne
    @JoinColumn(name = "CUSTOMER_ID")
    private CustomerEntity customer;

    @ManyToOne
    @JoinColumn(name = "RENTAL_ID")
    private RentalEntity rental;


}



