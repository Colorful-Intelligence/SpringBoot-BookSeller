package com.bookseller.bookseller.Service;

import com.bookseller.bookseller.Model.PurchaseHistory;
import com.bookseller.bookseller.Repository.Projection.IPurchaseItem;

import java.util.List;

public interface IPurchaseHistoryService {
    PurchaseHistory savePurchaseHistory(PurchaseHistory purchaseHistory);

    List<IPurchaseItem> findPurchasedItemsOfUser(Long userId);
}
