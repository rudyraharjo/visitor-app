/*
 Navicat Premium Data Transfer

 Source Server         : localPostgreSQL
 Source Server Type    : PostgreSQL
 Source Server Version : 120005
 Source Host           : localhost:5432
 Source Catalog        : db_visitor
 Source Schema         : public

 Target Server Type    : PostgreSQL
 Target Server Version : 120005
 File Encoding         : 65001

 Date: 18/05/2021 13:23:54
*/


-- ----------------------------
-- Table structure for visitor
-- ----------------------------
DROP TABLE IF EXISTS "public"."visitor";
CREATE TABLE "public"."visitor" (
  "id" int8 NOT NULL DEFAULT nextval('visitor_id_seq'::regclass),
  "datetime_in" timestamp(6),
  "datetime_out" timestamp(6),
  "email" varchar(255) COLLATE "pg_catalog"."default",
  "name" varchar(255) COLLATE "pg_catalog"."default",
  "phone" varchar(255) COLLATE "pg_catalog"."default",
  "temperature" varchar(255) COLLATE "pg_catalog"."default",
  "building_id" int8
)
;

-- ----------------------------
-- Records of visitor
-- ----------------------------
INSERT INTO "public"."visitor" VALUES (2, '2021-05-18 13:00:00', '2021-05-18 15:30:00', 'santikomalasari@gmail.com', 'Santi Komalasari', '085695527400', '34', 6);
INSERT INTO "public"."visitor" VALUES (3, '2021-05-18 13:00:00', '2021-05-18 15:30:00', 'rudyraharjo@gmail.com', 'Rudy Raharjo', '085695527400', '34', 6);

-- ----------------------------
-- Primary Key structure for table visitor
-- ----------------------------
ALTER TABLE "public"."visitor" ADD CONSTRAINT "visitor_pkey" PRIMARY KEY ("id");

-- ----------------------------
-- Foreign Keys structure for table visitor
-- ----------------------------
ALTER TABLE "public"."visitor" ADD CONSTRAINT "fkqy8vgygj80qcktua0kndq8etd" FOREIGN KEY ("building_id") REFERENCES "public"."ms_building" ("id") ON DELETE NO ACTION ON UPDATE NO ACTION;
