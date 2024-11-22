import pandas as pd
import matplotlib.pyplot as plt
from matplotlib import font_manager, rc
from sklearn.model_selection import train_test_split
from sklearn.ensemble import RandomForestClassifier
from sklearn.preprocessing import LabelEncoder
from sklearn.metrics import accuracy_score, classification_report
# 폰트 설정
font_path = "H2GPRM.TTF"
font_name=font_manager.FontProperties(fname=font_path).get_name()
rc('font', family=font_name)

 
# 데이터 불러오기 (올바른 시트 이름 사용)
data = pd.read_excel('dataset_root.xlsx', sheet_name='점수')

# Load the 'ver2' sheet data for modeling
# ver2_data = data['ver2']

# Select features and target variable
X = data[['관계', '장소']]
y = data['판정']

# Encode categorical variables
le_relation = LabelEncoder()
le_location = LabelEncoder()
X.loc[:, '관계'] = le_relation.fit_transform(X['관계'])
X.loc[:, '장소'] = le_location.fit_transform(X['장소'])
y = LabelEncoder().fit_transform(y)

# Split the data into training and testing sets
X_train, X_test, y_train, y_test = train_test_split(
    X, y, test_size=0.3, random_state=42)

# Train a RandomForestClassifier model
model = RandomForestClassifier(random_state=42)
model.fit(X_train, y_train)

# Make predictions and evaluate the model
y_pred = model.predict(X_test)
accuracy = accuracy_score(y_test, y_pred)
classification_rep = classification_report(y_test, y_pred)

print("accuracy \n", accuracy)
print("classification_rep \n", classification_rep)
