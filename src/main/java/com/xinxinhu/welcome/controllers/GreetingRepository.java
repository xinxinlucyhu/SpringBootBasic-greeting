package com.xinxinhu.welcome.controllers;


import org.springframework.data.repository.CrudRepository;


public interface GreetingRepository extends CrudRepository<Greeting,Long>
{

}
