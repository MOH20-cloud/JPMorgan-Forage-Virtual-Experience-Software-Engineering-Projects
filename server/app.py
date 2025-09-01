from flask import Flask, jsonify
app = Flask(__name__)
@app.get("/health")
def health():
    return jsonify(status="ok", messsage="JPMC Forage Task 1 setup works")
if __name__ == "__main__":
    app.run(debug=True, port=5000)
