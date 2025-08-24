package app.domain.repository;

import app.domain.model.BillingInfo;
import java.util.List;

public interface BillingRepository {
    void save(BillingInfo b);
    List<BillingInfo> findByIdCard(String idCard);
}
