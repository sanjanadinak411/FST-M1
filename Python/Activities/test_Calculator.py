import pytest


@pytest.mark.parametrize("tuple_params", [(3, 3)])
def test_Sum(tuple_params): 
    a,b=tuple_params 
    total=a+b
    assert total==6

@pytest.mark.parametrize("tuple_params", [(3, 3)])
def test_Subtract(tuple_params):
    c,d=tuple_params 
    diff=c-d
    assert diff==0


@pytest.mark.parametrize("tuple_params", [(3, 3)])
def test_Multiply(tuple_params):
    e,f=tuple_params 
    prod=e*f
    assert prod==9


@pytest.mark.parametrize("tuple_params", [(3, 3)])
def test_Divide(tuple_params):
    g,h=tuple_params 
    div=g/h
    assert div==1