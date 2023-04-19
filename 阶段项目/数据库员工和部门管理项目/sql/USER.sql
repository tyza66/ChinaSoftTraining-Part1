/*
 Navicat Premium Data Transfer

 Source Server         : helowin
 Source Server Type    : Oracle
 Source Server Version : 110200
 Source Host           : 172.27.128.1:1521
 Source Schema         : SCOTT

 Target Server Type    : Oracle
 Target Server Version : 110200
 File Encoding         : 65001

 Date: 19/04/2023 09:47:10
*/


-- ----------------------------
-- Table structure for USER
-- ----------------------------
DROP TABLE "SCOTT"."USER";
CREATE TABLE "SCOTT"."USER" (
  "USERNAME" VARCHAR2(255 BYTE) NOT NULL,
  "PASSWORD" VARCHAR2(255 BYTE) NOT NULL
)
LOGGING
NOCOMPRESS
PCTFREE 10
INITRANS 1
STORAGE (
  INITIAL 65536 
  NEXT 1048576 
  MINEXTENTS 1
  MAXEXTENTS 2147483645
  BUFFER_POOL DEFAULT
)
PARALLEL 1
NOCACHE
DISABLE ROW MOVEMENT
;

-- ----------------------------
-- Records of USER
-- ----------------------------
INSERT INTO "SCOTT"."USER" VALUES ('tyza66', 'tyza66');
INSERT INTO "SCOTT"."USER" VALUES ('admin', 'admin');

-- ----------------------------
-- Checks structure for table USER
-- ----------------------------
ALTER TABLE "SCOTT"."USER" ADD CONSTRAINT "SYS_C0011188" CHECK ("USERNAME" IS NOT NULL) NOT DEFERRABLE INITIALLY IMMEDIATE NORELY VALIDATE;
ALTER TABLE "SCOTT"."USER" ADD CONSTRAINT "SYS_C0011189" CHECK ("PASSWORD" IS NOT NULL) NOT DEFERRABLE INITIALLY IMMEDIATE NORELY VALIDATE;
