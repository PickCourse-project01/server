CREATE SEQUENCE SEQ_PAY;

CREATE TABLE TBL_PAY(
                        ID NUMBER CONSTRAINT PK_PAY PRIMARY KEY,
                        PAY_PRICE NUMBER DEFAULT 0,
                        PAY_PERSONNEL NUMBER DEFAULT 1,
                        PAY_USED_POINT NUMBER DEFAULT 0,
                        PAY_NEW_POINT NUMBER DEFAULT 0,
                        PAY_METHOD NUMBER(3) NOT NULL,
                        PAY_CARD_COMPANY NUMBER(3) NOT NULL,
                        MEMBER_ID NUMBER NOT NULL,
                        PLAN_ID NUMBER NOT NULL,
                        CREATE_DATE DATE DEFAULT SYSDATE,
                        UPDATE_DATE DATE DEFAULT SYSDATE,
                        CONSTRAINT FK_PAY_MEMBER FOREIGN KEY(MEMBER_ID)
                            REFERENCES TBL_MEMBER(ID),
                        CONSTRAINT FK_PAY_PLAN FOREIGN KEY(PLAN_ID)
                            REFERENCES TBL_PLAN(ID)
);

SELECT * FROM TBL_MEMBER;
SELECT * FROM TBL_COURSE;