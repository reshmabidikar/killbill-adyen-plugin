/*
 * This file is generated by jOOQ.
 */
package org.killbill.billing.plugin.adyen.dao.gen.tables.records;


import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record20;
import org.jooq.Row20;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.ULong;
import org.killbill.billing.plugin.adyen.dao.gen.tables.AdyenNotifications;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AdyenNotificationsRecord extends UpdatableRecordImpl<AdyenNotificationsRecord> implements Record20<ULong, String, String, String, String, BigDecimal, String, String, LocalDateTime, String, String, String, String, String, String, String, Short, String, LocalDateTime, String> {

    private static final long serialVersionUID = 1798448963;

    /**
     * Setter for <code>killbill.adyen_notifications.record_id</code>.
     */
    public void setRecordId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>killbill.adyen_notifications.record_id</code>.
     */
    public ULong getRecordId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>killbill.adyen_notifications.kb_account_id</code>.
     */
    public void setKbAccountId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>killbill.adyen_notifications.kb_account_id</code>.
     */
    public String getKbAccountId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>killbill.adyen_notifications.kb_payment_id</code>.
     */
    public void setKbPaymentId(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>killbill.adyen_notifications.kb_payment_id</code>.
     */
    public String getKbPaymentId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>killbill.adyen_notifications.kb_payment_transaction_id</code>.
     */
    public void setKbPaymentTransactionId(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>killbill.adyen_notifications.kb_payment_transaction_id</code>.
     */
    public String getKbPaymentTransactionId() {
        return (String) get(3);
    }

    /**
     * Setter for <code>killbill.adyen_notifications.transaction_type</code>.
     */
    public void setTransactionType(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>killbill.adyen_notifications.transaction_type</code>.
     */
    public String getTransactionType() {
        return (String) get(4);
    }

    /**
     * Setter for <code>killbill.adyen_notifications.amount</code>.
     */
    public void setAmount(BigDecimal value) {
        set(5, value);
    }

    /**
     * Getter for <code>killbill.adyen_notifications.amount</code>.
     */
    public BigDecimal getAmount() {
        return (BigDecimal) get(5);
    }

    /**
     * Setter for <code>killbill.adyen_notifications.currency</code>.
     */
    public void setCurrency(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>killbill.adyen_notifications.currency</code>.
     */
    public String getCurrency() {
        return (String) get(6);
    }

    /**
     * Setter for <code>killbill.adyen_notifications.event_code</code>.
     */
    public void setEventCode(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>killbill.adyen_notifications.event_code</code>.
     */
    public String getEventCode() {
        return (String) get(7);
    }

    /**
     * Setter for <code>killbill.adyen_notifications.event_date</code>.
     */
    public void setEventDate(LocalDateTime value) {
        set(8, value);
    }

    /**
     * Getter for <code>killbill.adyen_notifications.event_date</code>.
     */
    public LocalDateTime getEventDate() {
        return (LocalDateTime) get(8);
    }

    /**
     * Setter for <code>killbill.adyen_notifications.merchant_account_code</code>.
     */
    public void setMerchantAccountCode(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>killbill.adyen_notifications.merchant_account_code</code>.
     */
    public String getMerchantAccountCode() {
        return (String) get(9);
    }

    /**
     * Setter for <code>killbill.adyen_notifications.merchant_reference</code>.
     */
    public void setMerchantReference(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>killbill.adyen_notifications.merchant_reference</code>.
     */
    public String getMerchantReference() {
        return (String) get(10);
    }

    /**
     * Setter for <code>killbill.adyen_notifications.operations</code>.
     */
    public void setOperations(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>killbill.adyen_notifications.operations</code>.
     */
    public String getOperations() {
        return (String) get(11);
    }

    /**
     * Setter for <code>killbill.adyen_notifications.original_reference</code>.
     */
    public void setOriginalReference(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>killbill.adyen_notifications.original_reference</code>.
     */
    public String getOriginalReference() {
        return (String) get(12);
    }

    /**
     * Setter for <code>killbill.adyen_notifications.payment_method</code>.
     */
    public void setPaymentMethod(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>killbill.adyen_notifications.payment_method</code>.
     */
    public String getPaymentMethod() {
        return (String) get(13);
    }

    /**
     * Setter for <code>killbill.adyen_notifications.psp_reference</code>.
     */
    public void setPspReference(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>killbill.adyen_notifications.psp_reference</code>.
     */
    public String getPspReference() {
        return (String) get(14);
    }

    /**
     * Setter for <code>killbill.adyen_notifications.reason</code>.
     */
    public void setReason(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>killbill.adyen_notifications.reason</code>.
     */
    public String getReason() {
        return (String) get(15);
    }

    /**
     * Setter for <code>killbill.adyen_notifications.success</code>.
     */
    public void setSuccess(Short value) {
        set(16, value);
    }

    /**
     * Getter for <code>killbill.adyen_notifications.success</code>.
     */
    public Short getSuccess() {
        return (Short) get(16);
    }

    /**
     * Setter for <code>killbill.adyen_notifications.additional_data</code>.
     */
    public void setAdditionalData(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>killbill.adyen_notifications.additional_data</code>.
     */
    public String getAdditionalData() {
        return (String) get(17);
    }

    /**
     * Setter for <code>killbill.adyen_notifications.created_date</code>.
     */
    public void setCreatedDate(LocalDateTime value) {
        set(18, value);
    }

    /**
     * Getter for <code>killbill.adyen_notifications.created_date</code>.
     */
    public LocalDateTime getCreatedDate() {
        return (LocalDateTime) get(18);
    }

    /**
     * Setter for <code>killbill.adyen_notifications.kb_tenant_id</code>.
     */
    public void setKbTenantId(String value) {
        set(19, value);
    }

    /**
     * Getter for <code>killbill.adyen_notifications.kb_tenant_id</code>.
     */
    public String getKbTenantId() {
        return (String) get(19);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<ULong> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record20 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row20<ULong, String, String, String, String, BigDecimal, String, String, LocalDateTime, String, String, String, String, String, String, String, Short, String, LocalDateTime, String> fieldsRow() {
        return (Row20) super.fieldsRow();
    }

    @Override
    public Row20<ULong, String, String, String, String, BigDecimal, String, String, LocalDateTime, String, String, String, String, String, String, String, Short, String, LocalDateTime, String> valuesRow() {
        return (Row20) super.valuesRow();
    }

    @Override
    public Field<ULong> field1() {
        return AdyenNotifications.ADYEN_NOTIFICATIONS.RECORD_ID;
    }

    @Override
    public Field<String> field2() {
        return AdyenNotifications.ADYEN_NOTIFICATIONS.KB_ACCOUNT_ID;
    }

    @Override
    public Field<String> field3() {
        return AdyenNotifications.ADYEN_NOTIFICATIONS.KB_PAYMENT_ID;
    }

    @Override
    public Field<String> field4() {
        return AdyenNotifications.ADYEN_NOTIFICATIONS.KB_PAYMENT_TRANSACTION_ID;
    }

    @Override
    public Field<String> field5() {
        return AdyenNotifications.ADYEN_NOTIFICATIONS.TRANSACTION_TYPE;
    }

    @Override
    public Field<BigDecimal> field6() {
        return AdyenNotifications.ADYEN_NOTIFICATIONS.AMOUNT;
    }

    @Override
    public Field<String> field7() {
        return AdyenNotifications.ADYEN_NOTIFICATIONS.CURRENCY;
    }

    @Override
    public Field<String> field8() {
        return AdyenNotifications.ADYEN_NOTIFICATIONS.EVENT_CODE;
    }

    @Override
    public Field<LocalDateTime> field9() {
        return AdyenNotifications.ADYEN_NOTIFICATIONS.EVENT_DATE;
    }

    @Override
    public Field<String> field10() {
        return AdyenNotifications.ADYEN_NOTIFICATIONS.MERCHANT_ACCOUNT_CODE;
    }

    @Override
    public Field<String> field11() {
        return AdyenNotifications.ADYEN_NOTIFICATIONS.MERCHANT_REFERENCE;
    }

    @Override
    public Field<String> field12() {
        return AdyenNotifications.ADYEN_NOTIFICATIONS.OPERATIONS;
    }

    @Override
    public Field<String> field13() {
        return AdyenNotifications.ADYEN_NOTIFICATIONS.ORIGINAL_REFERENCE;
    }

    @Override
    public Field<String> field14() {
        return AdyenNotifications.ADYEN_NOTIFICATIONS.PAYMENT_METHOD;
    }

    @Override
    public Field<String> field15() {
        return AdyenNotifications.ADYEN_NOTIFICATIONS.PSP_REFERENCE;
    }

    @Override
    public Field<String> field16() {
        return AdyenNotifications.ADYEN_NOTIFICATIONS.REASON;
    }

    @Override
    public Field<Short> field17() {
        return AdyenNotifications.ADYEN_NOTIFICATIONS.SUCCESS;
    }

    @Override
    public Field<String> field18() {
        return AdyenNotifications.ADYEN_NOTIFICATIONS.ADDITIONAL_DATA;
    }

    @Override
    public Field<LocalDateTime> field19() {
        return AdyenNotifications.ADYEN_NOTIFICATIONS.CREATED_DATE;
    }

    @Override
    public Field<String> field20() {
        return AdyenNotifications.ADYEN_NOTIFICATIONS.KB_TENANT_ID;
    }

    @Override
    public ULong component1() {
        return getRecordId();
    }

    @Override
    public String component2() {
        return getKbAccountId();
    }

    @Override
    public String component3() {
        return getKbPaymentId();
    }

    @Override
    public String component4() {
        return getKbPaymentTransactionId();
    }

    @Override
    public String component5() {
        return getTransactionType();
    }

    @Override
    public BigDecimal component6() {
        return getAmount();
    }

    @Override
    public String component7() {
        return getCurrency();
    }

    @Override
    public String component8() {
        return getEventCode();
    }

    @Override
    public LocalDateTime component9() {
        return getEventDate();
    }

    @Override
    public String component10() {
        return getMerchantAccountCode();
    }

    @Override
    public String component11() {
        return getMerchantReference();
    }

    @Override
    public String component12() {
        return getOperations();
    }

    @Override
    public String component13() {
        return getOriginalReference();
    }

    @Override
    public String component14() {
        return getPaymentMethod();
    }

    @Override
    public String component15() {
        return getPspReference();
    }

    @Override
    public String component16() {
        return getReason();
    }

    @Override
    public Short component17() {
        return getSuccess();
    }

    @Override
    public String component18() {
        return getAdditionalData();
    }

    @Override
    public LocalDateTime component19() {
        return getCreatedDate();
    }

    @Override
    public String component20() {
        return getKbTenantId();
    }

    @Override
    public ULong value1() {
        return getRecordId();
    }

    @Override
    public String value2() {
        return getKbAccountId();
    }

    @Override
    public String value3() {
        return getKbPaymentId();
    }

    @Override
    public String value4() {
        return getKbPaymentTransactionId();
    }

    @Override
    public String value5() {
        return getTransactionType();
    }

    @Override
    public BigDecimal value6() {
        return getAmount();
    }

    @Override
    public String value7() {
        return getCurrency();
    }

    @Override
    public String value8() {
        return getEventCode();
    }

    @Override
    public LocalDateTime value9() {
        return getEventDate();
    }

    @Override
    public String value10() {
        return getMerchantAccountCode();
    }

    @Override
    public String value11() {
        return getMerchantReference();
    }

    @Override
    public String value12() {
        return getOperations();
    }

    @Override
    public String value13() {
        return getOriginalReference();
    }

    @Override
    public String value14() {
        return getPaymentMethod();
    }

    @Override
    public String value15() {
        return getPspReference();
    }

    @Override
    public String value16() {
        return getReason();
    }

    @Override
    public Short value17() {
        return getSuccess();
    }

    @Override
    public String value18() {
        return getAdditionalData();
    }

    @Override
    public LocalDateTime value19() {
        return getCreatedDate();
    }

    @Override
    public String value20() {
        return getKbTenantId();
    }

    @Override
    public AdyenNotificationsRecord value1(ULong value) {
        setRecordId(value);
        return this;
    }

    @Override
    public AdyenNotificationsRecord value2(String value) {
        setKbAccountId(value);
        return this;
    }

    @Override
    public AdyenNotificationsRecord value3(String value) {
        setKbPaymentId(value);
        return this;
    }

    @Override
    public AdyenNotificationsRecord value4(String value) {
        setKbPaymentTransactionId(value);
        return this;
    }

    @Override
    public AdyenNotificationsRecord value5(String value) {
        setTransactionType(value);
        return this;
    }

    @Override
    public AdyenNotificationsRecord value6(BigDecimal value) {
        setAmount(value);
        return this;
    }

    @Override
    public AdyenNotificationsRecord value7(String value) {
        setCurrency(value);
        return this;
    }

    @Override
    public AdyenNotificationsRecord value8(String value) {
        setEventCode(value);
        return this;
    }

    @Override
    public AdyenNotificationsRecord value9(LocalDateTime value) {
        setEventDate(value);
        return this;
    }

    @Override
    public AdyenNotificationsRecord value10(String value) {
        setMerchantAccountCode(value);
        return this;
    }

    @Override
    public AdyenNotificationsRecord value11(String value) {
        setMerchantReference(value);
        return this;
    }

    @Override
    public AdyenNotificationsRecord value12(String value) {
        setOperations(value);
        return this;
    }

    @Override
    public AdyenNotificationsRecord value13(String value) {
        setOriginalReference(value);
        return this;
    }

    @Override
    public AdyenNotificationsRecord value14(String value) {
        setPaymentMethod(value);
        return this;
    }

    @Override
    public AdyenNotificationsRecord value15(String value) {
        setPspReference(value);
        return this;
    }

    @Override
    public AdyenNotificationsRecord value16(String value) {
        setReason(value);
        return this;
    }

    @Override
    public AdyenNotificationsRecord value17(Short value) {
        setSuccess(value);
        return this;
    }

    @Override
    public AdyenNotificationsRecord value18(String value) {
        setAdditionalData(value);
        return this;
    }

    @Override
    public AdyenNotificationsRecord value19(LocalDateTime value) {
        setCreatedDate(value);
        return this;
    }

    @Override
    public AdyenNotificationsRecord value20(String value) {
        setKbTenantId(value);
        return this;
    }

    @Override
    public AdyenNotificationsRecord values(ULong value1, String value2, String value3, String value4, String value5, BigDecimal value6, String value7, String value8, LocalDateTime value9, String value10, String value11, String value12, String value13, String value14, String value15, String value16, Short value17, String value18, LocalDateTime value19, String value20) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        value19(value19);
        value20(value20);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AdyenNotificationsRecord
     */
    public AdyenNotificationsRecord() {
        super(AdyenNotifications.ADYEN_NOTIFICATIONS);
    }

    /**
     * Create a detached, initialised AdyenNotificationsRecord
     */
    public AdyenNotificationsRecord(ULong recordId, String kbAccountId, String kbPaymentId, String kbPaymentTransactionId, String transactionType, BigDecimal amount, String currency, String eventCode, LocalDateTime eventDate, String merchantAccountCode, String merchantReference, String operations, String originalReference, String paymentMethod, String pspReference, String reason, Short success, String additionalData, LocalDateTime createdDate, String kbTenantId) {
        super(AdyenNotifications.ADYEN_NOTIFICATIONS);

        set(0, recordId);
        set(1, kbAccountId);
        set(2, kbPaymentId);
        set(3, kbPaymentTransactionId);
        set(4, transactionType);
        set(5, amount);
        set(6, currency);
        set(7, eventCode);
        set(8, eventDate);
        set(9, merchantAccountCode);
        set(10, merchantReference);
        set(11, operations);
        set(12, originalReference);
        set(13, paymentMethod);
        set(14, pspReference);
        set(15, reason);
        set(16, success);
        set(17, additionalData);
        set(18, createdDate);
        set(19, kbTenantId);
    }
}
