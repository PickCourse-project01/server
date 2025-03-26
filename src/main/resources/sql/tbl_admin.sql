CREATE SEQUENCE SEQ_ADMIN;
CREATE TABLE TBL_ADMIN(
                          ID NUMBER CONSTRAINT PK_ADMIN PRIMARY KEY,
                          ADMIN_ACCOUNT VARCHAR2(1000) CONSTRAINT UK_ACCOUNT UNIQUE NOT NULL,
                          ADMIN_PASSWORD VARCHAR2(1000) DEFAULT '1234',
                          ADMIN_NAME VARCHAR2(1000) NOT NULL,
                          ADMIN_PHONE VARCHAR2(1000) NOT NULL,
                          ADMIN_EMAIL VARCHAR2(1000) NOT NULL,
                          CREATED_DATE DATE DEFAULT SYSDATE,
                          UPDATED_DATE DATE DEFAULT SYSDATE
);
COMMENT ON TABLE TBL_ADMIN IS '관리자 테이블';
COMMENT ON COLUMN TBL_ADMIN.ID IS '고유 식별자';
COMMENT ON COLUMN TBL_ADMIN.ADMIN_ACCOUNT IS '관리자 계정 (고유 제약 조건)';
COMMENT ON COLUMN TBL_ADMIN.ADMIN_PASSWORD IS '관리자 비밀번호 (기본값: ''1234'')';
COMMENT ON COLUMN TBL_ADMIN.ADMIN_NAME IS '관리자 이름';
COMMENT ON COLUMN TBL_ADMIN.ADMIN_PHONE IS '관리자 전화번호';
COMMENT ON COLUMN TBL_ADMIN.ADMIN_EMAIL IS '관리자 이메일';
COMMENT ON COLUMN TBL_COURSE.CREATED_DATE IS '레코드 생성 날짜 (기본값: SYSDATE)';
COMMENT ON COLUMN TBL_COURSE.UPDATED_DATE IS '레코드 수정 날짜 (기본값: SYSDATE)';
