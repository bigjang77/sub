### 테이블 생성
```sql
create table users(
    id number primary key,
    username varchar2(20),
    password varchar2(20),
    email varchar2(50),
    createdAt TIMESTAMP
);

CREATE SEQUENCE users_seq 
INCREMENT BY 1 
START WITH 1;
```

### 더미데이터 추가
```sql
iINSERT INTO USER(NAME, job, createdAt) VALUES("momo", "가수", NOW());
INSERT INTO USER(NAME, job, createdAt) VALUES("soso", "가수", NOW());
INSERT INTO USER(NAME, job, createdAt) VALUES("roro", "가수", NOW());
INSERT INTO USER(NAME, job, createdAt) VALUES("coco", "댄서", NOW());
INSERT INTO USER(NAME, job, createdAt) VALUES("bobo", "댄서", NOW());
INSERT INTO USER(NAME, job, createdAt) VALUES("wowo", "댄서", NOW());
INSERT INTO USER(NAME, job, createdAt) VALUES("toto", "경찰", NOW());
INSERT INTO USER(NAME, job, createdAt) VALUES("nono", "경찰", NOW());
INSERT INTO USER(NAME, job, createdAt) VALUES("yoyo", "경찰", NOW());
```
