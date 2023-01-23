package com.example.bmitest;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.bmitest.databinding.ActivityMainBinding;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.kaghaz.setOnClickListener(view -> {

            String rockname = "rock";
            String papername = "paper";
            String scissorsname = "scissors";
            String[] game = {rockname, papername, scissorsname};
            String complay;
            String yourplay=("paper");
            int index;
            binding.texsresr.setText(yourplay);
            Random random = new Random();
            index=random.nextInt(3);
            complay=game[index];
            binding.texsresr.setText("me     " + yourplay + "     bot      "    + complay);
            if (yourplay.equals(complay)) {
                binding.natije.setText("tin");
            } else if (yourplay.equals(rockname) && complay.equals(papername)) {
                binding.natije.setText("win bot");
            } else if (yourplay.equals(rockname) && complay.equals(scissorsname)) {
                binding.natije.setText("win");
            } else if (yourplay.equals(papername) && complay.equals(rockname)) {
                binding.natije.setText("win");
            } else if (yourplay.equals(papername) && complay.equals(scissorsname)) {
                binding.natije.setText("win bot");
            } else if (yourplay.equals(scissorsname) && complay.equals(rockname)) {
                binding.natije.setText("win bot");
            } else if (yourplay.equals(scissorsname) && complay.equals(papername)) {
                binding.natije.setText("win");
            }

        });

        binding.ghechi.setOnClickListener(view -> {
            String rockname = "rock";
            String papername = "paper";
            String scissorsname = "scissors";
            String[] game = {rockname, papername, scissorsname};
            String complay;
            String yourplay=("scissors");
            int index;
            binding.texsresr.setText(yourplay);
            Random random = new Random();
            index=random.nextInt(3);
            complay=game[index];
            binding.texsresr.setText("me     " + yourplay + "     bot      "    + complay);

            if (yourplay.equals(complay)) {
                binding.natije.setText("tin");
            } else if (yourplay.equals(rockname) && complay.equals(papername)) {
                binding.natije.setText("win bot");
            } else if (yourplay.equals(rockname) && complay.equals(scissorsname)) {
                binding.natije.setText("win");
            } else if (yourplay.equals(papername) && complay.equals(rockname)) {
                binding.natije.setText("win");
            } else if (yourplay.equals(papername) && complay.equals(scissorsname)) {
                binding.natije.setText("win bot");
            } else if (yourplay.equals(scissorsname) && complay.equals(rockname)) {
                binding.natije.setText("win bot");
            } else if (yourplay.equals(scissorsname) && complay.equals(papername)) {
                binding.natije.setText("win");
            }

        });
        binding.sang.setOnClickListener(view -> {

            String rockname = "rock";
            String papername = "paper";
            String scissorsname = "scissors";
            String[] game = {rockname, papername, scissorsname};
            String complay;
            String yourplay=("rock");
            int index;
            binding.texsresr.setText(yourplay);
            Random random = new Random();
            index=random.nextInt(3);
            complay=game[index];
            binding.texsresr.setText("me     " + yourplay + "     bot      "    + complay);

            if (yourplay.equals(complay)) {
                binding.natije.setText("tin");
            } else if (yourplay.equals(rockname) && complay.equals(papername)) {
                binding.natije.setText("win bot");
            } else if (yourplay.equals(rockname) && complay.equals(scissorsname)) {
                binding.natije.setText("win");
            } else if (yourplay.equals(papername) && complay.equals(rockname)) {
                binding.natije.setText("win");
            } else if (yourplay.equals(papername) && complay.equals(scissorsname)) {
                binding.natije.setText("win bot");
            } else if (yourplay.equals(scissorsname) && complay.equals(rockname)) {
                binding.natije.setText("win bot");
            } else if (yourplay.equals(scissorsname) && complay.equals(papername)) {
                binding.natije.setText("win");
            }

        });


        }
    }