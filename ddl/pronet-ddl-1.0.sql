CREATE TABLE USER(ID INTEGER not NULL AUTO_INCREMENT PRIMARY KEY, FIRST_NAME VARCHAR(256),LAST_NAME VARCHAR(256),GUID VARCHAR(256));
CREATE TABLE SKILL(ID INTEGER not null AUTO_INCREMENT PRIMARY KEY, SKILL_NAME VARCHAR(25),SKILL_DESCRIPTION VARCHAR(256));
ALTER TABLE SKILL ADD COLUMN USER_ID INT FOREIGN KEY REFERENCES USER.ID;