import pytest


@pytest.fixture
def input_value():
   input = [0,1,2,3,4,5,6,7,8,9,10]
   return input
 
def test_total(input_value):
    total=0
    for n in input_value:
        total=total+n
   
    assert total==55