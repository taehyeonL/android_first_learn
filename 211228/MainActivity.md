# MainActivity



```
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
}
```

activity_main.xml을 처음 실행한다.



## 연결하기

### 전역변수 선언

```
EditText et_id;
Button btn_test;
```

### onCreate 메소드에서 연결

```
et_id=findViewById(R.id.et_id);
btn_test=findViewById(R.id.btn_text);
```

#### R.id.(id명) 으로 찾아간다.

