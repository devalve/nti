alter table nti.planet
    add column lord_id integer references nti.lord(id);
