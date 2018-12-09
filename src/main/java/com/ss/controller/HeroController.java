package com.ss.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ss.pojo.Hero;
import com.ss.service.HeroService;

@RestController
public class HeroController {
	private static final Hero Hreo = null;
	@Autowired
	private HeroService hs;
	@GetMapping("demo")
	public Hero findHero(@RequestParam Integer id){
		return hs.getById(id);
	}
	@GetMapping("page")
	public IPage<Hero> fen(){
		Page<Hero> page = new Page<Hero>(4,10);
		return hs.page(page, new QueryWrapper<Hero>(Hreo));
	}
}
