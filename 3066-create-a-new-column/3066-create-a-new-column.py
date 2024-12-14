import pandas as pd

def createBonusColumn(employees: pd.DataFrame) -> pd.DataFrame:
    df=pd.DataFrame(employees,columns=['name','salary'])
    df['bonus']=employees['salary']*2
    return df