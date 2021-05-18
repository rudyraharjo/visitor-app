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

 Date: 18/05/2021 13:23:46
*/


-- ----------------------------
-- Table structure for ms_building
-- ----------------------------
DROP TABLE IF EXISTS "public"."ms_building";
CREATE TABLE "public"."ms_building" (
  "id" int8 NOT NULL,
  "capacity" varchar(255) COLLATE "pg_catalog"."default",
  "name" varchar(255) COLLATE "pg_catalog"."default",
  "telephone" varchar(255) COLLATE "pg_catalog"."default",
  "timevisit" int4,
  "time_visit_f" time(6),
  "datetime_visit_t" time(6)
)
;

-- ----------------------------
-- Records of ms_building
-- ----------------------------
INSERT INTO "public"."ms_building" VALUES (6, '800 Orang', 'Gedung Tua', '021-58906121', NULL, '10:00:00', '21:00:00');
INSERT INTO "public"."ms_building" VALUES (7, '800 Orang', 'Gedung Tua', '021-58906121', NULL, '10:00:00', '21:00:00');
INSERT INTO "public"."ms_building" VALUES (8, '56 Orang', 'TSM Building', '021-589061245', NULL, '10:00:00', '18:00:00');

-- ----------------------------
-- Primary Key structure for table ms_building
-- ----------------------------
ALTER TABLE "public"."ms_building" ADD CONSTRAINT "ms_building_pkey" PRIMARY KEY ("id");
