package com.mpei.vmss.mobile_application_development.check_work_2;

public  abstract class Set {
    protected void add(Object object){};
    protected void intersect(Set a, Set b){};
    protected void join(Set a, Set b){};
    protected void subtract(Set a, Set b){};
    protected void show(){}
}
