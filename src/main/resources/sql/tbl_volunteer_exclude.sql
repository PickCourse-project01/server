CREATE SEQUENCE SEQ_VOLUNTEER_EXCLUDE;
CREATE TABLE TBL_VOLUNTEER_EXCLUDE(
                             ID NUMBER CONSTRAINT PK_VOLUNTEER_EXCLUDE PRIMARY KEY,
                             EXCLUDE_CONTENT VARCHAR2(1000),
                             VOLUNTEER_ID NUMBER NOT NULL,
                             CREATED_DATE DATE DEFAULT SYSDATE,
                             UPDATED_DATE DATE DEFAULT SYSDATE,
                             CONSTRAINT FK_EXCLUDE_VOLUNTEER FOREIGN KEY(VOLUNTEER_ID)
                             REFERENCES TBL_VOLUNTEER(ID) ON DELETE CASCADE
);
COMMENT ON COLUMN TBL_VOLUNTEER_EXCLUDE.ID IS '불포함된 봉사 항목의 고유 ID (기본 키)';
COMMENT ON COLUMN TBL_VOLUNTEER_EXCLUDE.EXCLUDE_CONTENT IS '봉사 항목의 세부 내용';
COMMENT ON COLUMN TBL_VOLUNTEER_EXCLUDE.VOLUNTEER_ID IS '참조된 봉사 일정 ID (외래 키)';
COMMENT ON COLUMN TBL_VOLUNTEER_EXCLUDE.CREATED_DATE IS '레코드 생성 날짜 (기본값: SYSDATE)';
COMMENT ON COLUMN TBL_VOLUNTEER_EXCLUDE.UPDATED_DATE IS '레코드 수정 날짜 (기본값: SYSDATE)';