
package com.store.bll.delegate;

import com.store.bll.impl.DiscountManagerImpl;
import com.store.bll.impl.LogManagerImpl;
import com.store.bll.impl.PurchasesManagerImpl;
import com.store.bll.impl.ReportsManagerImpl;
import com.store.bll.impl.SalesManagerImpl;
import com.store.bll.impl.SearchManagerImpl;
import com.store.bll.impl.SettingManagerImpl;
import com.store.common.beans.AdminBean;
import com.store.common.beans.CustomerBean;
import com.store.common.beans.DeliveryBillsBean;
import com.store.common.beans.DrugsBean;
import com.store.common.beans.LostDrugsBean;
import com.store.common.beans.PurchasesBillsBean;
import com.store.common.beans.SalesBillsBean;
import com.store.dal.entities.SalesBills;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author ahmed
 */
@Component(value = "getWay")
public class StoreGetWay {

    @Autowired(required = true)
    private ReportsManagerImpl reportsManagerImpl;
    @Autowired(required = true)
    private SettingManagerImpl settingImpl;
    @Autowired(required = true)
    private SearchManagerImpl searchManagerImpl;
    @Autowired(required = true)
    private SalesManagerImpl salesManagerImpl;
    @Autowired(required = true)
    private DiscountManagerImpl discountManagerImpl;
    @Autowired(required = true)
    private PurchasesManagerImpl purchasesManagerImpl;
 @Autowired(required = true)
    private LogManagerImpl logManagerImpl;
   
    public LogManagerImpl getManagerImpl() {
        return logManagerImpl;
    }

    public void setManagerImpl(LogManagerImpl logManagerImpl) {
        this.logManagerImpl = logManagerImpl;
    }

    public boolean login(AdminBean adminBean) {
        return logManagerImpl.login(adminBean);
    }

    public boolean logout() {
        return logManagerImpl.logout();
    }
 public AdminBean find(AdminBean adminBean) {
        return logManagerImpl.find(adminBean);
    }
    //------------------------------------------------------------------------
    public List<SalesBillsBean> listAllSales() {
        return reportsManagerImpl.listAllSales();
    }

    public List<SalesBillsBean> findByCodeSales(int billCode) {
        return reportsManagerImpl.findByCodeSales(billCode);
    }

    public List<SalesBillsBean> findByDateSales(Date from, Date to) {
        return reportsManagerImpl.findByDateSales(from, to);
    }

    public List<SalesBillsBean> findByTotalSales(int from, int to) {
        return reportsManagerImpl.findByTotalSales(from, to);
    }

    public List<SalesBillsBean> findByProfitSales(int from, int to) {
        return reportsManagerImpl.findByProfitSales(from, to);
    }

    public List<PurchasesBillsBean> listAllPurchases() {
        return reportsManagerImpl.listAllPurchases();
    }

    public List<PurchasesBillsBean> findByCodePurchases(int billCode) {
        return reportsManagerImpl.findByCodePurchases(billCode);
    }

    public List<PurchasesBillsBean> findByDatePurchases(Date from, Date to) {
        return reportsManagerImpl.findByDatePurchases(from, to);
    }

    public List<PurchasesBillsBean> findByTotalPurchases(int from, int to) {
        return reportsManagerImpl.findByTotalPurchases(from, to);
    }

    public int incom(Date from, Date to) {
        return reportsManagerImpl.incom(from, to);
    }

    public int payment(Date from, Date to) {
        return reportsManagerImpl.payment(from, to);
    }

    public int profits(Date from, Date to) {
        return reportsManagerImpl.profits(from, to);
    }

    //------------------------------------------------------------------------
    public void addAccount(AdminBean adminBean) {
        settingImpl.addAccount(adminBean);
    }

    public void deleteAccount(AdminBean adminBean) {
        settingImpl.deleteAccount(adminBean);
    }

    public void updatePassword(AdminBean adminBean) {
        settingImpl.updatePassword(adminBean);
    }

    public List<AdminBean> listAll() {
        return settingImpl.listAll();
    }
    //-------------------------------------------------------------------------

    public int createBill() {
        return purchasesManagerImpl.createBill();
    }

    public PurchasesBillsBean saveBill(PurchasesBillsBean bean) {
        return purchasesManagerImpl.saveBill(bean);
    }

    public LostDrugsBean addRequested(LostDrugsBean bean) {
        return purchasesManagerImpl.addRequested(bean);
    }

    public List<LostDrugsBean> listAllRequested() {
        return purchasesManagerImpl.listAllRequested();
    }

    public List<LostDrugsBean> listByNameRequested(String name) {
        return purchasesManagerImpl.listByNameRequested(name);
    }

    public List<LostDrugsBean> listByTypeRequested(String type) {
        return purchasesManagerImpl.listByTypeRequested(type);
    }

    public CustomerBean addCustomer(CustomerBean bean) {
        return purchasesManagerImpl.addCustomer(bean);
    }

    public List<CustomerBean> listAllCustomer() {
        return purchasesManagerImpl.listAllCustomer();
    }

    public List<CustomerBean> listByNameCustomer(String name) {
        return purchasesManagerImpl.listByNameCustomer(name);
    }

    public CustomerBean deleteCustomer(CustomerBean bean) {
        return purchasesManagerImpl.deleteCustomer(bean);
    }

    public CustomerBean updateCustomer(CustomerBean bean) {
        return purchasesManagerImpl.updateCustomer(bean);
    }

    public LostDrugsBean updateDrugRequested(LostDrugsBean bean) {
        return purchasesManagerImpl.updateDrugRequested(bean);
    }

    public DrugsBean deleteDrug(DrugsBean bean) {
        return purchasesManagerImpl.deleteDrug(bean);
    }

    public LostDrugsBean deleteLostDrug(LostDrugsBean bean) {
        return purchasesManagerImpl.deleteLostDrug(bean);
    }

    public List<DrugsBean> listAllFounded() {
        return purchasesManagerImpl.listAllFounded();
    }

    public List<DrugsBean> listByNamefounded(String name) {
        return purchasesManagerImpl.listByNamefounded(name);
    }

    public List<DrugsBean> listByTypefounded(String type) {
        return purchasesManagerImpl.listByTypefounded(type);
    }

    public List<DrugsBean> listByQuantityfounded(int from, int to) {
        return purchasesManagerImpl.listByQuantityfounded(from, to);
    }

    public List<DrugsBean> listByPricefounded(int from, int to) {
        return purchasesManagerImpl.listByPricefounded(from, to);
    }

    public List<DrugsBean> listByCompanyfounded(String name) {
        return purchasesManagerImpl.listByCompanyfounded(name);
    }

    public DrugsBean updateDrug(DrugsBean drugsBean) {
        return purchasesManagerImpl.updateDrug(drugsBean);
    }

    //------------------------------------------------------------------------
    public List<DrugsBean> listAllSearch() {
        return searchManagerImpl.listAllSearch();
    }

    public List<DrugsBean> findByNameSearch(String name) {
        return searchManagerImpl.findByNameSearch(name);
    }

    public List<DrugsBean> findByTypeSearch(String type) {
        return searchManagerImpl.findByTypeSearch(type);
    }

    public List<DrugsBean> findByPriceSearch(int from, int to) {
        return searchManagerImpl.findByPriceSearch(from, to);
    }

    //--------------------------------------------------------------------------
    public List<DrugsBean> findByDiscount(int from, int to) {
        return discountManagerImpl.findByDiscount(from, to);
    }

    public List<DrugsBean> findByNameDiscount(String name) {
        return discountManagerImpl.findByNameDiscount(name);
    }

    public List<DrugsBean> findByTypeDiscount(String type) {
        return discountManagerImpl.findByTypeDiscount(type);
    }

    public List<DrugsBean> findByPriceDiscount(int from, int to) {
        return discountManagerImpl.findByPriceDiscount(from, to);
    }

    public DrugsBean updateDiscount(String name, int value) {
        return discountManagerImpl.updateDiscount(name, value);
    }

    public List<DrugsBean> listAllDiscount() {
        return discountManagerImpl.listAllDiscount();
    }

//------------------------------------------------------------------------
    public List<DeliveryBillsBean> listAllDelivery() {
        return salesManagerImpl.listAllDelivery();
    }

    public List<DeliveryBillsBean> listByCodeDelivery(int code) {
        return salesManagerImpl.listByCodeDelivery(code);
    }

    public SalesBillsBean AddBillSales(SalesBills salesBills) {
        return salesManagerImpl.AddBillSales(salesBills);
    }

    public List<DrugsBean> findDrug(String name) {
        return salesManagerImpl.findDrug(name);
    }

    public SalesBillsBean saveSaleBill(SalesBillsBean bean) {
        return salesManagerImpl.saveSaleBill(bean);
    }

    public SalesBillsBean saveDeliveryBill(DeliveryBillsBean bean) {
        return salesManagerImpl.saveDeliveryBill(bean);
    }

    public DeliveryBillsBean deliveryBill(DeliveryBillsBean bean) {
        return salesManagerImpl.deliveryBill(bean);
    }

    public DeliveryBillsBean deletedeliveryBill(DeliveryBillsBean bean) {
        return salesManagerImpl.deletedeliveryBill(bean);
    }

    public ReportsManagerImpl getReportsManagerImpl() {
        return reportsManagerImpl;
    }

    public void setReportsManagerImpl(ReportsManagerImpl reportsManagerImpl) {
        this.reportsManagerImpl = reportsManagerImpl;
    }

    public SettingManagerImpl getSettingImpl() {
        return settingImpl;
    }

    public void setSettingImpl(SettingManagerImpl settingImpl) {
        this.settingImpl = settingImpl;
    }

    public PurchasesManagerImpl getPurchasesManagerImpl() {
        return purchasesManagerImpl;
    }

    public void setPurchasesManagerImpl(PurchasesManagerImpl purchasesManagerImpl) {
        this.purchasesManagerImpl = purchasesManagerImpl;
    }

    public SearchManagerImpl getSearchManagerImpl() {
        return searchManagerImpl;
    }

    public void setSearchManagerImpl(SearchManagerImpl searchManagerImpl) {
        this.searchManagerImpl = searchManagerImpl;
    }

    public DiscountManagerImpl getDiscountManagerImpl() {
        return discountManagerImpl;
    }

    public void setDiscountManagerImpl(DiscountManagerImpl discountManagerImpl) {
        this.discountManagerImpl = discountManagerImpl;
    }

    public SalesManagerImpl getSalesManagerImpl() {
        return salesManagerImpl;
    }

    public void setSalesManagerImpl(SalesManagerImpl salesManagerImpl) {
        this.salesManagerImpl = salesManagerImpl;
    }

    public LogManagerImpl getLogManagerImpl() {
        return logManagerImpl;
    }

    public void setLogManagerImpl(LogManagerImpl logManagerImpl) {
        this.logManagerImpl = logManagerImpl;
    }

}
