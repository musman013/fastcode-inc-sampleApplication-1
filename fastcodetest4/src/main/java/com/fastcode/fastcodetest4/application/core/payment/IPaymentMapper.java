package com.fastcode.fastcodetest4.application.core.payment;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import com.fastcode.fastcodetest4.domain.core.customer.CustomerEntity;
import com.fastcode.fastcodetest4.domain.core.rental.RentalEntity;
import com.fastcode.fastcodetest4.domain.core.staff.StaffEntity;
import com.fastcode.fastcodetest4.application.core.payment.dto.*;
import com.fastcode.fastcodetest4.domain.core.payment.PaymentEntity;
import java.time.*;

@Mapper(componentModel = "spring")
public interface IPaymentMapper {

   PaymentEntity createPaymentInputToPaymentEntity(CreatePaymentInput paymentDto);
   
   
   @Mappings({ 
   @Mapping(source = "entity.customer.customerId", target = "customerId"),                   
   @Mapping(source = "entity.customer.customerId", target = "customerDescriptiveField"),                    
   @Mapping(source = "entity.rental.rentalId", target = "rentalId"),                   
   @Mapping(source = "entity.rental.rentalId", target = "rentalDescriptiveField"),                    
   @Mapping(source = "entity.staff.staffId", target = "staffId"),                   
   @Mapping(source = "entity.staff.staffId", target = "staffDescriptiveField"),                    
   }) 
   CreatePaymentOutput paymentEntityToCreatePaymentOutput(PaymentEntity entity);
   
    PaymentEntity updatePaymentInputToPaymentEntity(UpdatePaymentInput paymentDto);
    
    @Mappings({ 
    @Mapping(source = "entity.customer.customerId", target = "customerId"),                   
    @Mapping(source = "entity.customer.customerId", target = "customerDescriptiveField"),                    
    @Mapping(source = "entity.rental.rentalId", target = "rentalId"),                   
    @Mapping(source = "entity.rental.rentalId", target = "rentalDescriptiveField"),                    
    @Mapping(source = "entity.staff.staffId", target = "staffId"),                   
    @Mapping(source = "entity.staff.staffId", target = "staffDescriptiveField"),                    
   	}) 
   	UpdatePaymentOutput paymentEntityToUpdatePaymentOutput(PaymentEntity entity);

   	@Mappings({ 
   	@Mapping(source = "entity.customer.customerId", target = "customerId"),                   
   	@Mapping(source = "entity.customer.customerId", target = "customerDescriptiveField"),                    
   	@Mapping(source = "entity.rental.rentalId", target = "rentalId"),                   
   	@Mapping(source = "entity.rental.rentalId", target = "rentalDescriptiveField"),                    
   	@Mapping(source = "entity.staff.staffId", target = "staffId"),                   
   	@Mapping(source = "entity.staff.staffId", target = "staffDescriptiveField"),                    
   	}) 
   	FindPaymentByIdOutput paymentEntityToFindPaymentByIdOutput(PaymentEntity entity);


   @Mappings({
   @Mapping(source = "foundPayment.paymentId", target = "paymentPaymentId"),
   })
   GetRentalOutput rentalEntityToGetRentalOutput(RentalEntity rental, PaymentEntity foundPayment);
   
   @Mappings({
   @Mapping(source = "foundPayment.paymentId", target = "paymentPaymentId"),
   })
   GetStaffOutput staffEntityToGetStaffOutput(StaffEntity staff, PaymentEntity foundPayment);
   
   @Mappings({
   @Mapping(source = "foundPayment.paymentId", target = "paymentPaymentId"),
   })
   GetCustomerOutput customerEntityToGetCustomerOutput(CustomerEntity customer, PaymentEntity foundPayment);
   
}

