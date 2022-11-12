|Modifier and Type|Method and Description|
|:---:|---|
|void|addTableModelListener(TableModelListener l)<br>데이터모델의 변경이 발생할때마다 알림을 주는 리스트에 리스너를 추가한다.|
|Class|getColumnClass(int columnIndex)<br>컬럼 벨류의 가장 특정한 슈퍼클래스를 리턴한다.|
|int|getColumnCount()<br>모델 안에 들어있는 컬럼의 수를 리턴한다.|
|String|getColumnName(int columnIndex)<br>columnIndex안에 있는 column의 이름을 리턴함.|
|int|getRowCount()<br>model 줄의 값을 리턴함.|
|Object|getValueAt(int rowIndex, int columnIndex)<br>columnIndex 와 rowIndex 안의 값을 리턴함.|
|boolean|isCellEditable(int rowIndex, int columnIndex)<br>만약 rowIndex와 columnIndex가 수정 가능하면, true를 리턴한다.|
|void|removeTableModelListener(TableModelListener l)<br>리스트 안의 모델 데이타를 삭제한다.|
|void|setValueAt(Object aValue, int rowIndex, int columnIndex)<br>columIndex 하고 rowIndex의 값을 설정한다.|
