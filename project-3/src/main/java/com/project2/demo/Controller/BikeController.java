package com.project2.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project2.demo.Service.BikeService;
import com.project2.demo.entity.Bike;

@RestController
public class BikeController {
	@Autowired
	BikeService bs;
	
@GetMapping("/set")
	public List <Bike>set()
	{
	    return bs.getall();
	}
@PostMapping("/ins")
    public Bike saved(@RequestBody Bike q)
    {
	    return bs.saveall(q);
    }
@PutMapping("/save")
    public Bike put(@RequestBody Bike q)
    {
	    return bs.update(q);
    }
@DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id)
    {
	    bs.delete(id);
    }
@GetMapping("/ins/{id}")
    public Optional<Bike> find(@PathVariable int id)
    {
		return bs.find(id);
    }


}
