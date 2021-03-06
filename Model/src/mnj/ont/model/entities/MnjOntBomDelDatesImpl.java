package mnj.ont.model.entities;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Oct 01 19:23:38 BDT 2015
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class MnjOntBomDelDatesImpl extends EntityImpl {
    private static EntityDefImpl mDefinitionObject;

    @Override
    protected void create(AttributeList attributeList) {
        super.create(attributeList);
        oracle.jbo.server.SequenceImpl s =new oracle.jbo.server.SequenceImpl("MNJ_ONT_BOM_DEL_DATES_S",getDBTransaction());
        oracle.jbo.domain.Number sVal = s.getSequenceNumber();
        setDetailId(sVal);
    }

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        DetailId {
            public Object get(MnjOntBomDelDatesImpl obj) {
                return obj.getDetailId();
            }

            public void put(MnjOntBomDelDatesImpl obj, Object value) {
                obj.setDetailId((Number)value);
            }
        }
        ,
        BomRmlineId {
            public Object get(MnjOntBomDelDatesImpl obj) {
                return obj.getBomRmlineId();
            }

            public void put(MnjOntBomDelDatesImpl obj, Object value) {
                obj.setBomRmlineId((Number)value);
            }
        }
        ,
        DeliveryDate {
            public Object get(MnjOntBomDelDatesImpl obj) {
                return obj.getDeliveryDate();
            }

            public void put(MnjOntBomDelDatesImpl obj, Object value) {
                obj.setDeliveryDate((Date)value);
            }
        }
        ,
        Qty {
            public Object get(MnjOntBomDelDatesImpl obj) {
                return obj.getQty();
            }

            public void put(MnjOntBomDelDatesImpl obj, Object value) {
                obj.setQty((Number)value);
            }
        }
        ,
        CustMnjOntBomRmlineLines {
            public Object get(MnjOntBomDelDatesImpl obj) {
                return obj.getCustMnjOntBomRmlineLines();
            }

            public void put(MnjOntBomDelDatesImpl obj, Object value) {
                obj.setCustMnjOntBomRmlineLines((CustMnjOntBomRmlineLinesImpl)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(MnjOntBomDelDatesImpl object);

        public abstract void put(MnjOntBomDelDatesImpl object, Object value);

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int DETAILID = AttributesEnum.DetailId.index();
    public static final int BOMRMLINEID = AttributesEnum.BomRmlineId.index();
    public static final int DELIVERYDATE = AttributesEnum.DeliveryDate.index();
    public static final int QTY = AttributesEnum.Qty.index();
    public static final int CUSTMNJONTBOMRMLINELINES = AttributesEnum.CustMnjOntBomRmlineLines.index();

    /**
     * This is the default constructor (do not remove).
     */
    public MnjOntBomDelDatesImpl() {
    }


    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        if (mDefinitionObject == null) {
            mDefinitionObject = EntityDefImpl.findDefObject("mnj.ont.model.entities.MnjOntBomDelDates");
        }
        return mDefinitionObject;
    }

    /**
     * Gets the attribute value for DetailId, using the alias name DetailId.
     * @return the DetailId
     */
    public Number getDetailId() {
        return (Number)getAttributeInternal(DETAILID);
    }

    /**
     * Sets <code>value</code> as the attribute value for DetailId.
     * @param value value to set the DetailId
     */
    public void setDetailId(Number value) {
        setAttributeInternal(DETAILID, value);
    }

    /**
     * Gets the attribute value for BomRmlineId, using the alias name BomRmlineId.
     * @return the BomRmlineId
     */
    public Number getBomRmlineId() {
        return (Number)getAttributeInternal(BOMRMLINEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for BomRmlineId.
     * @param value value to set the BomRmlineId
     */
    public void setBomRmlineId(Number value) {
        setAttributeInternal(BOMRMLINEID, value);
    }

    /**
     * Gets the attribute value for DeliveryDate, using the alias name DeliveryDate.
     * @return the DeliveryDate
     */
    public Date getDeliveryDate() {
        return (Date)getAttributeInternal(DELIVERYDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for DeliveryDate.
     * @param value value to set the DeliveryDate
     */
    public void setDeliveryDate(Date value) {
        setAttributeInternal(DELIVERYDATE, value);
    }

    /**
     * Gets the attribute value for Qty, using the alias name Qty.
     * @return the Qty
     */
    public Number getQty() {
        return (Number)getAttributeInternal(QTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for Qty.
     * @param value value to set the Qty
     */
    public void setQty(Number value) {
        setAttributeInternal(QTY, value);
    }

    /**
     * getAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param attrDef the attribute

     * @return the attribute value
     * @throws Exception
     */
    protected Object getAttrInvokeAccessor(int index,
                                           AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            return AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].get(this);
        }
        return super.getAttrInvokeAccessor(index, attrDef);
    }

    /**
     * setAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param value the value to assign to the attribute
     * @param attrDef the attribute

     * @throws Exception
     */
    protected void setAttrInvokeAccessor(int index, Object value,
                                         AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].put(this, value);
            return;
        }
        super.setAttrInvokeAccessor(index, value, attrDef);
    }

    /**
     * @return the associated entity CustMnjOntBomRmlineLinesImpl.
     */
    public CustMnjOntBomRmlineLinesImpl getCustMnjOntBomRmlineLines() {
        return (CustMnjOntBomRmlineLinesImpl)getAttributeInternal(CUSTMNJONTBOMRMLINELINES);
    }

    /**
     * Sets <code>value</code> as the associated entity CustMnjOntBomRmlineLinesImpl.
     */
    public void setCustMnjOntBomRmlineLines(CustMnjOntBomRmlineLinesImpl value) {
        setAttributeInternal(CUSTMNJONTBOMRMLINELINES, value);
    }

    /**
     * @param detailId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Number detailId) {
        return new Key(new Object[]{detailId});
    }


}
