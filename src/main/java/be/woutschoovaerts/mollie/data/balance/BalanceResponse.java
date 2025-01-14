package be.woutschoovaerts.mollie.data.balance;

import be.woutschoovaerts.mollie.data.common.Amount;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BalanceResponse {

    private String resource;

    private String id;

    private String mode;

    private String currency;

    private String description;

    private BalanceStatus status;

    private TransferFrequency transferFrequency;

    private Amount transferThreshold;

    private String transferReference;

    private TransferDestination transferDestination;


    private Amount availableAmount;

    private Amount pendingAmount;

    private OffsetDateTime createdAt;

    @JsonProperty("_links")
    private BalanceLinks links;

}
