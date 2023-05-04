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
import org.springframework.web.bind.annotation.RequestParam;
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
@GetMapping("/sort/{field}")
public List<Bike>sortBike(@PathVariable String field )
{
	return bs.sortby(field);
}

@GetMapping("/page/{offset}/{pagesize}")
public List<Bike>paging(@PathVariable int offset,@PathVariable int pagesize)
{
	return bs.paging(offset,pagesize);
}
@GetMapping("/com/{offset}/{pagesize}/{field}")
public List<Bike>page(@PathVariable int offset,@PathVariable int pagesize,@PathVariable String field )
{
	return bs.page(offset,pagesize,field);
}
@GetMapping("/fetchDemoModelPrefix")
public List<Bike>fetchBikePrefix(@RequestParam String prefix)
{
	return bs.fetchBikePrefix(prefix);
}
@GetMapping("/suffix")
public List<Bike>fetchBikeSufix(@RequestParam String sufix)
{
	return bs.fetchBikeSufix(sufix);
}
@GetMapping("/getbybikename")
public List<Bike>getBybikename(@RequestParam String bikename)
{
	return bs.getByBikename(bikename);
}
@GetMapping("/getbyengine")
public List<Bike>getByEngine(@RequestParam String engine)
{
	return bs.getByEngine(engine);
}
//dml
@GetMapping("/email")
public List<Bike>fetchBikeEngine(@RequestParam String engine)
{
	return bs.fetchBikeEngine(engine);

}
//dml
@DeleteMapping("/deletebyname/{bikename}")
public String deleteByBikename(@PathVariable String bikename)
{
	int result=bs.deleteByBikename(bikename);
	if(result>0)
	{
		return "record deleted";
	}
	else
	{
		return "not deleted";
	}
}
@PutMapping("/updatebyname/{bikename}/{engine}")
public String updateByBikename(@PathVariable String bikename,@PathVariable String engine)
{
	int result=bs.updateByBikename(bikename,engine);
	if(result>0)
	{
		return "upadated";
	}
	else
	{
		return "not updated";
	}
}

}
