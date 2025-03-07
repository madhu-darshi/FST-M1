import pytest

#this is using the num_list which we have declared in the conftest
def test_sum(num_list):
    sum = 0
    for n in num_list:
        sum += n
    
    assert sum == 55

#own try 
def test_print_even(num_list):
    exp_res = [0,2,4,6,8]
    act_res = []
    for n in num_list:
        if n % 2 == 0:
            act_res.extend(str(n))

    assert act_res == exp_res