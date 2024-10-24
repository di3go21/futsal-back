create table jugador
(
    id               bigint not null,
    dorsal           bigint not null,
    nombre           varchar(255),
    apodo            varchar(255),
    fecha_nacimiento date,
    urlFoto          varchar(600),

    created          timestamp(6),
    primary key (id)
);
create sequence jugador_seq start with 1 increment by 1;
insert into jugador (id, nombre, dorsal, fecha_nacimiento, urlFoto, created)
values (nextval('jugador_seq'), 'Aitor', 1, '1990-01-01', null, current_timestamp),
       (nextval('jugador_seq'), 'Aitor', 1,'1990-01-01', null, current_timestamp),
       (nextval('jugador_seq'), 'Peru', 21,'1990-01-01', null, current_timestamp),
       (nextval('jugador_seq'), 'Ochoa', 7,'1990-01-01', null, current_timestamp),
       (nextval('jugador_seq'), 'Christian', 11,'1990-01-01', null, current_timestamp),
       (nextval('jugador_seq'), 'Mini', 3,'1990-01-01', null, current_timestamp),
       (nextval('jugador_seq'), 'Adrián', 77,'1990-01-01', null, current_timestamp),
       (nextval('jugador_seq'), 'Mario', 4,'1990-01-01', null, current_timestamp),
       (nextval('jugador_seq'), 'Javi R.', 5,'1990-01-01', null, current_timestamp),
       (nextval('jugador_seq'), 'Raúl', 12,'1990-01-01', null, current_timestamp),
       (nextval('jugador_seq'), 'Rubi', 10,'1990-01-01', null, current_timestamp),
       (nextval('jugador_seq'), 'Galin', 2,'1990-01-01', null, current_timestamp),
       (nextval('jugador_seq'), 'Borja', 15,'1990-01-01', null, current_timestamp),
       (nextval('jugador_seq'), 'Dagon', 28,'1990-01-01', null, current_timestamp),
       (nextval('jugador_seq'), 'Aparicio', 99,'1990-01-01', null, current_timestamp),
       (nextval('jugador_seq'), 'Alf', 8,'1990-01-01', null, current_timestamp),
       (nextval('jugador_seq'), 'Cuñao', 98,'1990-01-01', null, current_timestamp),
       (nextval('jugador_seq'), 'Blazquez', 13,'1990-01-01', null, current_timestamp),
       (nextval('jugador_seq'), 'Prats', 23,'1990-01-01', null, current_timestamp);