### 테이블 생성
```sql
create table user(
    user_id int primary KEY auto_increment,
    name varchar(20),
    username VARCHAR(20),
    PASSWORD VARCHAR(20),
    job VARCHAR(20)
);

CREATE TABLE home (
home_id int primary KEY AUTO_INCREMENT,
home_name VARCHAR (50),
home_tel VARCHAR (50),
home_location VARCHAR (50)
);

CREATE TABLE sub (
sub_id INT primary KEY AUTO_INCREMENT,
user_id INT,
home_id INT
);

```

### 더미데이터 추가
```sql

INSERT INTO user(NAME, username, PASSWORD, job) VALUES ('철수', 'jojo', '1234', '요리사');
INSERT INTO user(NAME, username, PASSWORD, job) VALUES ('영희', 'momo', '1234', '선생님');
INSERT INTO user(NAME, username, PASSWORD, job) VALUES ('주작', 'soso', '1234', '공무원');

INSERT INTO home(home_name, home_tel, home_location) VALUES ('주공아파트', "010-1111-2222", '부산');
INSERT INTO home(home_name, home_tel, home_location) VALUES ('우성아파트', "010-2222-3333", '서울');
INSERT INTO home(home_name, home_tel, home_location) VALUES ('부영아파트', "010-4444-5555", '광주');

INSERT INTO sub (user_id, home_id) VALUES (1,1);
INSERT INTO sub (user_id, home_id) VALUES (2,2);
INSERT INTO sub (user_id, home_id) VALUES (3,3);
```
