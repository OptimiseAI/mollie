package be.woutschoovaerts.mollie.data.order;

import be.woutschoovaerts.mollie.data.payment.PaymentResponse;
import be.woutschoovaerts.mollie.data.refund.RefundResponse;
import be.woutschoovaerts.mollie.data.shipment.ShipmentResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderEmbedded {

    private List<PaymentResponse> payments;

    private List<RefundResponse> refunds;

    private List<ShipmentResponse> shipments;

}
