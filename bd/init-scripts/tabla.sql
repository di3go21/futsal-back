create table accion
(
    id             bigint not null,
    accion         varchar(255),
    created        timestamp(6),
    dorsal         integer,
    dorsal_entrada integer,
    tiempo         varchar(255),
    user_id        varchar(255),
    primary key (id)
);
create sequence accion_seq start with 1 increment by 1;