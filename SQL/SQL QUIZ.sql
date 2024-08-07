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
values('M001','�˫n����','�]�߿��˫n����ڵ�72��','03-7474796');
insert into PLC
values('M002','�]�ߤ���','�]�߿��]�ߥ������109��','03-7320059');
insert into PLC
values('M003','�Y������','�]�߿��Y����������503��','03-7663004');

insert into VO
values('V001','�j�H��','037-581072','�˫n���q��1035��');
insert into VO
values('V002','�˫n��','037-472735','�˫n��˫n�����s��103��');
insert into VO
values('V003','�s�Ψ�','037-614186','�˫n��s�Ψ������14��');
insert into VO
values('V004','�H����','037-724839','���s��H����������136-1��');
insert into VO
values('V005','��]��','037-333240','�]�ߥ���]��������766��');
insert into VO
values('V006','���ڨ�','037-660001','���ڨ����ڸ�96��');
insert into VO
values('V007','������','037-661145','���������j��82��');
insert into VO
values('V008','�H�q��','037-616072','�H�q���H�q��53��1��');

insert into C_ADD
values('���J','V001','�]�߿��˫n���H��20��','100','1','M001');
insert into C_ADD
values('�j��','V002','�]�߿��˫n��M����79��','3142','1','M001');
insert into C_ADD
values('�j��','V003','�]�߿��˫n���s�s���T�q142��','1072','1','M001');
insert into C_ADD
values('���@�]�I','V004','�]�߿����s���ظ�1498��','32','1','M001');
insert into C_ADD
values('���J','V005','�]�߿��]�ߥ��̥���80��','106','1','M002');
insert into C_ADD
values('���J','V005','�]�߿��]�ߥ����_��117��','26','1','M002');
insert into C_ADD
values('�j��','V005','�]�߿��]�ߥ��շR��109��','2038','2','M002');
insert into C_ADD
values('�j��','V005','�]�߿��]�ߥ��j�P��53��','128','2','M002');
insert into C_ADD
values('���@�]�I','V006','�]�߿��Y�������ڨ��M����102��','353','1','M003');
insert into C_ADD
values('�p����','V007','�]�߿��Y�������������@��69��','501','1','M003');
insert into C_ADD
values('���J','V008','�]�߿��Y�����H�q��������65��','194','1','M003');
insert into C_ADD
values('�p����','V008','�]�߿��Y�����H�q��������116��','78','1','M003');

/*Q4*/
-- 4-1
select distinct PLC.M as ���Ҥ���, PLC.TEL as �����s���q�� 
from PLC, C_ADD
where PLC.M_ID=C_ADD.M and C_ADD.N > 1000 ;
-- 4-2
select distinct PLC.M as ���Ҥ���, PLC.TEL as �����s���q��, count(C_ADD.C_ADD) over (partition by PLC.M) as �U���Ҥ����]�I�ƶq
from PLC, C_ADD
where PLC.M_ID=C_ADD.M and C_ADD.N > 1000;
--4-3
select 
    PLC.M as ���Ҥ���, 
    PLC.TEL as �����s���q��,
    count(C_ADD.C_ADD) over (partition by PLC.M) as �U���Ҥ����]�I�ƶq,
    C_ADD.C_ADD as �����]�I�a�},
    C_ADD.BUL as ����
from PLC, C_ADD
where PLC.M_ID=C_ADD.M and C_ADD.N > 1000 ;
--4-4
select 
    VO.V as �����O,
    C_ADD.C_ADD as �����]�I�a�},
    C_ADD.N as �e�H�ƶq,
    PLC.M as ���Ҥ���,
    PLC.TEL as �����s���q��
from PLC, C_ADD, VO
where PLC.M_ID=C_ADD.M and C_ADD.V=VO.V_ID and C_ADD like('%��%') ;
--4-5
select 
    VO.V as �����O,
    VO.V_ADD as �����줽�Ǧ�m,
    C_ADD.C_ADD as �����]�I�a�},
    C_ADD.N as �e�H�ƶq
from C_ADD, VO
where C_ADD.V=VO.V_ID and C_ADD.BUL in('���J','�j��');
    
--5-1
update C_ADD
set N='5000'
where C_ADD='�]�߿��˫n��M����79��';
--5-2
delete from C_ADD
where N<1000 ;
