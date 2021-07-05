
drop table if exists play.play.stage;
drop table if exists play.play.base;
create  table if not exists play.play.stage (id int generated by default as identity,instrument varchar,stock int,primary key (id));
create  table if not exists play.play.base (baseid uuid not null, id int,instrument varchar,stock int,primary key (baseid));
create extension "uuid-ossp";
CREATE OR REPLACE FUNCTION play.play.copydata() RETURNS INT AS $$ BEGIN EXECUTE 'insert into play.play.base select uuid_generate_v4(), *  from play.play.stage'; RETURN 1; END; $$ LANGUAGE plpgsql;

--create or replace procedure play.play.copydata() LANGUAGE SQL as $$ insert into play.play.base select *  from play.play.stage;  $$

