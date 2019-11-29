package com.mezan.tablayout;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentManager;

public class MyAdapter extends FragmentPagerAdapter {

    Context myContext;
    int totalTabs;

    public MyAdapter(Context context, FragmentManager fm, int totalTabs) {
        super(fm);
        this.myContext = context;
        this.totalTabs = totalTabs;
    }

    // this is for fragment tabs
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                //Appetizer
                HomeFragment homeFragment = new HomeFragment();
                return homeFragment;
            case 1:
                //Salad
                SportsFragment sportFragment = new SportsFragment();
                return sportFragment;
            case 2:
                //Pasta
                MovieFragment movieFragment = new MovieFragment();
                return movieFragment;
            case 3:
                //Pizza
                PizzaFragment Pizza = new PizzaFragment();
                return Pizza;
            case 4:
                //Burger
                BurgerFragment Burger = new BurgerFragment();
                return Burger;
            case 5:
                //Chicken
                ChickenFragment Chicken = new ChickenFragment();
                return Chicken;
            case 6:
                //Beef
                MovieFragment Beef = new MovieFragment();
                return Beef;
            case 7:
                //Vegetable
                VegetableFragment Vegetable = new VegetableFragment();
                return Vegetable;
            case 8:
                //Rice
                RiceFragment Rice = new RiceFragment();
                return Rice;
            case 9:
                //set menu
                SetMenuFragment setmenu = new SetMenuFragment();
                return setmenu;
            case 10:
                //Soup
                Soup Soup = new Soup();
                return Soup;
            case 11:
                //Drinks
                DrinksFragment Drinks = new DrinksFragment();
                return Drinks;
            default:
                return null;
        }
    }
    // this counts total number of tabs
    @Override
    public int getCount() {
        return totalTabs;
    }
}
