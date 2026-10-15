# Frontend - Pomonai App (React Native / Expo)

Este repositório contém a interface mobile do aplicativo **Pomonai**, desenvolvida em React Native utilizando Expo Router.

## 📁 Estrutura do Projeto

* `src/app/index.jsx`: Tela principal da aplicação responsável pela interface de envio de dúvidas e comunicação com a API.

## 🚀 Funcionalidades e Código (`src/app/index.jsx`)

### 1. Gerenciamento de Estado
Utilizamos o hook `useState` do React para controlar o texto digitado pelo usuário no campo de entrada de texto:
```javascript
const [duvida, setDuvida] = useState("");
```

### 2. Envio de Dados via HTTP (`fetch`)
A função `enviarDuvida` é uma função assíncrona responsável por enviar a dúvida para o servidor back-end local (Spring Boot):
* **URL do Endpoint:** `http://localhost:8080/duvida`
* **Método HTTP:** `POST`
* **Cabeçalho:** `'Content-Type': 'application/json'` para garantir o envio no formato JSON.
* **Corpo da requisição:** Envia um objeto com a chave `duvida` contendo o valor do estado (`JSON.stringify({ duvida })`).
* **Tratamento de Feedback:** Exibe alertas nativos com `Alert.alert()` informando o sucesso ou falha no envio.

```javascript
const enviarDuvida = async () => {
  try {
    const response = await fetch('http://localhost:8080/duvida', {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json',
      },
      body: JSON.stringify({ duvida }),
    });

    Alert.alert("Dúvida enviada com sucesso!");
  } catch (error) {
    Alert.alert("Erro ao enviar dúvida");
  }
}
```

### 3. Componentes de Interface
* **`TextInput`:** Campo configurado com `onChangeText={setDuvida}` e `value={duvida}` para atualizar o estado conforme o usuário digita.
* **`TouchableOpacity`:** Botão clicável customizado com estilos do `StyleSheet` que aciona a função `enviarDuvida` ao ser pressionado (`onPress`).

## 🛠️ Como Executar

1. Instale as dependências:
   ```bash
   npm install
   ```
2. Inicie o servidor do Expo:
   ```bash
   npx expo start
   ```