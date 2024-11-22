import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
from sklearn.model_selection import train_test_split
from sklearn.ensemble import HistGradientBoostingClassifier
from sklearn.preprocessing import LabelEncoder
from sklearn.metrics import accuracy_score, classification_report
from matplotlib import font_manager, rc
# 폰트 설정
font_path = "H2GPRM.TTF"
font_name=font_manager.FontProperties(fname=font_path).get_name()
rc('font', family=font_name)

# 데이터 불러오기 (올바른 시트 이름 사용)
data = pd.read_excel('dataset_root.xlsx', sheet_name='정규화')

# Select features and target variable
X = data[['관계', '장소']]
y = data['판정']

# Encode categorical variables
le_relation = LabelEncoder()
le_location = LabelEncoder()
X['관계'] = le_relation.fit_transform(X['관계'])
X['장소'] = le_location.fit_transform(X['장소'])
y = LabelEncoder().fit_transform(y)

# Split the data into training and testing sets
X_train, X_test, y_train, y_test = train_test_split(
    X, y, test_size=0.3, random_state=42)

# Train a HistGradientBoostingClassifier model
model = HistGradientBoostingClassifier(random_state=42)
model.fit(X_train, y_train)

# Make predictions and evaluate the model
y_pred = model.predict(X_test)
accuracy = accuracy_score(y_test, y_pred)
classification_rep = classification_report(y_test, y_pred)

print("Accuracy:", accuracy)
print("Classification Report:\n", classification_rep)

# Plot decision boundaries
x_min, x_max = X['관계'].min() - 1, X['관계'].max() + 1
y_min, y_max = X['장소'].min() - 1, X['장소'].max() + 1
xx, yy = np.meshgrid(np.arange(x_min, x_max, 0.1),
                     np.arange(y_min, y_max, 0.1))

# Predict the decision boundaries for each point in the grid
Z = model.predict(np.c_[xx.ravel(), yy.ravel()])
Z = Z.reshape(xx.shape)

# Plotting
plt.figure(figsize=(10, 6))
plt.contourf(xx, yy, Z, alpha=0.3, cmap=plt.cm.Paired)
scatter = plt.scatter(X['관계'], X['장소'], c=y, s=30, 
                      edgecolor='k', cmap=plt.cm.Paired)
plt.xlabel('관계')
plt.ylabel('장소')
plt.title('Decision Boundary of HistGradientBoostingClassifier')
plt.legend(*scatter.legend_elements(), title="Classes")
plt.show()