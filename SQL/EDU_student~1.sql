select 
    CUT.CUSTOMER_ID as 客戶編號 ,
    CUT.NAME as 客戶名稱,
    count(SO.ORDER_NO) as 購買次數,
    sum(SOD.MONEY) as 購買的金額
from SQL_CUSTOMER_STORE CUT,
     SQL_ORDER_DETAIL SOD,
     SQL_ORDER SO
where CUT.CUSTOMER_ID=CUST_ID 
and SO.ORDER_NO=SOD.ORDER_NO
and SOD.ITEM_NO in('C0001','C0004','C0006','C0011')
group by  CUT.CUSTOMER_ID, CUT.NAME
order by CUT.CUSTOMER_ID;
    