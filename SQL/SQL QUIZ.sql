/*Q2*/
create table PLC(
M_ID varchar2(20 byte) primary key,
M varchar2(20 byte),
ADDR varchar2(100 byte),
TEL varchar2(50 byte));
commit;

create table VO(
V_ID varchar2(20) primary key,
V varchar2(20),
TEL varchar2(50),
V_ADD varchar2(100));
commit;

create table C_ADD(
BUL varchar2(20),
V varchar2(20) references VO(V_ID),
C_ADD varchar2(100),
N varchar2(30),
FL varchar2(10),
M varchar2(20) references PLC(M_ID));
commit;

/*Q3*/
insert into PLC
values('M001','竹南分局','苗栗縣竹南鎮民族街72號','03-7474796');
insert into PLC
values('M002','苗栗分局','苗栗縣苗栗市金鳳街109號','03-7320059');
insert into PLC
values('M003','頭份分局','苗栗縣頭份市中興路503號','03-7663004');

insert into VO
values('V001','大埔里','037-581072','竹南鎮公義路1035號');
insert into VO
values('V002','竹南里','037-472735','竹南鎮竹南里中山路103號');
insert into VO
values('V003','山佳里','037-614186','竹南鎮山佳里國光街14號');
insert into VO
values('V004','埔頂里','037-724839','後龍鎮埔頂里中興路136-1號');
insert into VO
values('V005','綠苗里','037-333240','苗栗市綠苗里中正路766號');
insert into VO
values('V006','民族里','037-660001','民族里民族路96號');
insert into VO
values('V007','忠孝里','037-661145','忠孝里光大街82號');
insert into VO
values('V008','信義里','037-616072','信義里信義路53巷1號');

insert into C_ADD
values('公寓','V001','苗栗縣竹南鎮中埔街20號','100','1','M001');
insert into C_ADD
values('大樓','V002','苗栗縣竹南鎮和平街79號','3142','1','M001');
insert into C_ADD
values('大樓','V003','苗栗縣竹南鎮龍山路三段142號','1072','1','M001');
insert into C_ADD
values('公共設施','V004','苗栗縣後龍鎮中華路1498號','32','1','M001');
insert into C_ADD
values('公寓','V005','苗栗縣苗栗市米市街80號','106','1','M002');
insert into C_ADD
values('公寓','V005','苗栗縣苗栗市光復路117號','26','1','M002');
insert into C_ADD
values('大樓','V005','苗栗縣苗栗市博愛街109號','2038','2','M002');
insert into C_ADD
values('大樓','V005','苗栗縣苗栗市大同路53號','128','2','M002');
insert into C_ADD
values('公共設施','V006','苗栗縣頭份市民族里和平路102號','353','1','M003');
insert into C_ADD
values('私營單位','V007','苗栗縣頭份市忠孝忠孝一路69號','501','1','M003');
insert into C_ADD
values('公寓','V008','苗栗縣頭份市信義里中正路65號','194','1','M003');
insert into C_ADD
values('私營單位','V008','苗栗縣頭份市信義里中正路116號','78','1','M003');

/*Q4*/
-- 4-1
select distinct PLC.M as 管轄分局, PLC.TEL as 分局連絡電話 
from PLC, C_ADD
where PLC.M_ID=C_ADD.M and C_ADD.N > 1000 ;
-- 4-2
select distinct PLC.M as 管轄分局, PLC.TEL as 分局連絡電話, count(C_ADD.C_ADD) over (partition by PLC.M) as 各管轄分局設施數量
from PLC, C_ADD
where PLC.M_ID=C_ADD.M and C_ADD.N > 1000;
--4-3
select 
    PLC.M as 管轄分局, 
    PLC.TEL as 分局連絡電話,
    count(C_ADD.C_ADD) over (partition by PLC.M) as 各管轄分局設施數量,
    C_ADD.C_ADD as 避難設施地址,
    C_ADD.BUL as 類型
from PLC, C_ADD
where PLC.M_ID=C_ADD.M and C_ADD.N > 1000 ;
--4-4
select 
    VO.V as 村里別,
    C_ADD.C_ADD as 避難設施地址,
    C_ADD.N as 容人數量,
    PLC.M as 管轄分局,
    PLC.TEL as 分局連絡電話
from PLC, C_ADD, VO
where PLC.M_ID=C_ADD.M and C_ADD.V=VO.V_ID and C_ADD like('%中%') ;
--4-5
select 
    VO.V as 村里別,
    VO.V_ADD as 村里辦公室位置,
    C_ADD.C_ADD as 避難設施地址,
    C_ADD.N as 容人數量
from C_ADD, VO
where C_ADD.V=VO.V_ID and C_ADD.BUL in('公寓','大樓');
    
--5-1
update C_ADD
set N='5000'
where C_ADD='苗栗縣竹南鎮和平街79號';
--5-2
delete from C_ADD
where N<1000 ;
