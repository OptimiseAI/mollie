package be.woutschoovaerts.mollie.data.chargeback;

import be.woutschoovaerts.mollie.data.common.Amount;
import be.woutschoovaerts.mollie.data.links.ChargebackLinks;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;
import java.util.Optional;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ChargebackResponse {

    private String resource;

    private String id;

    private Amount amount;

    private Amount settlementAmount;

    private ChargebackReason reason;

    private String paymentId;

    @Builder.Default
    private Optional<String> settlementId = Optional.empty();

    private OffsetDateTime createdAt;

    private OffsetDateTime reversedAt;

    @JsonProperty("_links")
    private ChargebackLinks links;

    @JsonProperty("_embedded")
    @Builder.Default
    private Optional<ChargebackEmbedded> embedded = Optional.empty();
}
