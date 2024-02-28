package com.cat;

import java.util.List;

public record Cat(String name, List<CatFood> favoriteFoods) {}