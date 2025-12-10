import pytest


@pytest.fixture
def wallet():
    amount=0
    return amount

@pytest.mark.parametrize("earned, spent, expected", [ (30, 10, 20), (20, 2, 18)])
def test_transactions(wallet, earned, spent, expected):

    print(f"My wallet initially has {wallet}")

    wallet=+earned
    print(f"I add {earned} units of cash to the {wallet}")

    print(f"I spend {spent} units of cash, and")

    remaining=wallet-spent
    assert remaining==expected
    print(f"I should have {expected} units of cash remaining after the two transactions.")