package com.example.app;

import static spark.Spark.*;

public class App {

    public static void main(String[] args) {

        port(8080);

        get("/", (req, res) -> "Hello from Java app deployed on EKS using GitHub Actions + ArgoCD!");

        get("/health", (req, res) -> "OK");
    }
}
