select 
    CUT.CUSTOMER_ID as �Ȥ�s�� ,
    CUT.NAME as �Ȥ�W��,
    count(SO.ORDER_NO) as �ʶR����,
    sum(SOD.MONEY) as �ʶR�����B
from SQL_CUSTOMER_STORE CUT,
     SQL_ORDER_DETAIL SOD,
     SQL_ORDER SO
where CUT.CUSTOMER_ID=CUST_ID 
and SO.ORDER_NO=SOD.ORDER_NO
and SOD.ITEM_NO in('C0001','C0004','C0006','C0011')
group by  CUT.CUSTOMER_ID, CUT.NAME
order by CUT.CUSTOMER_ID;
    