package com.example.bmitest;

import static com.example.bmitest.R.color.yeloo;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

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

        binding.ghechi.setOnClickListener(view -> {
            Animation anim= AnimationUtils.loadAnimation(MainActivity.this,R.anim.fade_out);
            binding.play.startAnimation(anim);
            binding.play.setImageResource(R.drawable.scissors);
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
            binding.texsresr.setText("you "+yourplay + " bot "    + complay);
            if (yourplay.equals(complay)) {
                binding.natije.setText("equal");binding.backgerand0.setImageResource(R.drawable.yeloo);
            } else if (yourplay.equals(rockname) && complay.equals(papername)) {
                binding.natije.setText("bot win");
                binding.backgerand0.setImageResource(R.drawable.red);
            } else if (yourplay.equals(rockname) && complay.equals(scissorsname)) {
                binding.natije.setText("you win");
                binding.backgerand0.setImageResource(R.drawable.grin);
            } else if (yourplay.equals(papername) && complay.equals(rockname)) {
                binding.natije.setText("you win");
                binding.backgerand0.setImageResource(R.drawable.grin);
            } else if (yourplay.equals(papername) && complay.equals(scissorsname)) {
                binding.natije.setText("bot win");
                binding.backgerand0.setImageResource(R.drawable.red);
            } else if (yourplay.equals(scissorsname) && complay.equals(rockname)) {
                binding.natije.setText("bot win");
                binding.backgerand0.setImageResource(R.drawable.red);
            } else if (yourplay.equals(scissorsname) && complay.equals(papername)) {
                binding.natije.setText("you win");
                binding.backgerand0.setImageResource(R.drawable.grin);
            }
            if (complay.equals(papername)){
                Animation anim33= AnimationUtils.loadAnimation(MainActivity.this,R.anim.fade_out);
                binding.rock.startAnimation(anim33);
                binding.rock.setImageResource(R.drawable.peper);
            }else if (complay.equals(scissorsname)){
                Animation anim44= AnimationUtils.loadAnimation(MainActivity.this,R.anim.fade_out);
                binding.rock.startAnimation(anim44);
                binding.rock.setImageResource(R.drawable.scissors);
            }else if (complay.equals(rockname)){
                Animation anim55= AnimationUtils.loadAnimation(MainActivity.this,R.anim.fade_out);
                binding.rock.startAnimation(anim55);
                binding.rock.setImageResource(R.drawable.rocks);
            }

        });
        binding.sang.setOnClickListener(view -> {
            Animation anim= AnimationUtils.loadAnimation(MainActivity.this,R.anim.fade_out);
            binding.play.startAnimation(anim);
            binding.play.setImageResource(R.drawable.rocks);

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
            binding.texsresr.setText("you "+yourplay + " bot "    + complay);

            if (yourplay.equals(complay)) {
                binding.natije.setText("equal");
                binding.backgerand0.setImageResource(R.drawable.yeloo);
            } else if (yourplay.equals(rockname) && complay.equals(papername)) {
                binding.natije.setText("bot win");
                binding.backgerand0.setImageResource(R.drawable.red);
            } else if (yourplay.equals(rockname) && complay.equals(scissorsname)) {
                binding.natije.setText("you win");
                binding.backgerand0.setImageResource(R.drawable.grin);
            } else if (yourplay.equals(papername) && complay.equals(rockname)) {
                binding.natije.setText("you win");
                binding.backgerand0.setImageResource(R.drawable.grin);
            } else if (yourplay.equals(papername) && complay.equals(scissorsname)) {
                binding.natije.setText("bot win");
                binding.backgerand0.setImageResource(R.drawable.red);
            } else if (yourplay.equals(scissorsname) && complay.equals(rockname)) {
                binding.natije.setText("bot win");
                binding.backgerand0.setImageResource(R.drawable.red);
            } else if (yourplay.equals(scissorsname) && complay.equals(papername)) {
                binding.natije.setText("you win");
                binding.backgerand0.setImageResource(R.drawable.grin);
            }
            if (complay.equals(papername)){
                Animation ani6m= AnimationUtils.loadAnimation(MainActivity.this,R.anim.fade_out);
                binding.rock.startAnimation(ani6m);
                binding.rock.setImageResource(R.drawable.peper);
            }else if (complay.equals(scissorsname)){
                Animation ani7m= AnimationUtils.loadAnimation(MainActivity.this,R.anim.fade_out);
                binding.rock.startAnimation(ani7m);
                binding.rock.setImageResource(R.drawable.scissors);
            }else if (complay.equals(rockname)){
                Animation anima= AnimationUtils.loadAnimation(MainActivity.this,R.anim.fade_out);
                binding.rock.startAnimation(anima);
                binding.rock.setImageResource(R.drawable.rocks);
            }

        });

        binding.kaghaz.setOnClickListener(view -> {
            Animation anim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.fade_out);
            binding.play.startAnimation(anim);
            binding.play.setImageResource(R.drawable.peper);
            String rockname = "rock";
            String papername = "paper";
            String scissorsname = "scissors";
            String[] game = {rockname, papername, scissorsname};
            String complay;
            String yourplay = ("paper");
            int index;
            binding.texsresr.setText(yourplay);
            Random random = new Random();
            index = random.nextInt(3);
            complay = game[index];
            binding.texsresr.setText("you " + yourplay + " bot " + complay);
            if (yourplay.equals(complay)) {
                binding.natije.setText("equal");
                binding.backgerand0.setImageResource(R.drawable.yeloo);
            } else if (yourplay.equals(rockname) && complay.equals(papername)) {
                binding.natije.setText("bot win");
                binding.backgerand0.setImageResource(R.drawable.red);
            } else if (yourplay.equals(rockname) && complay.equals(scissorsname)) {
                binding.natije.setText("you win");
                binding.backgerand0.setImageResource(R.drawable.grin);
            } else if (yourplay.equals(papername) && complay.equals(rockname)) {
                binding.natije.setText("you win");
                binding.backgerand0.setImageResource(R.drawable.grin);
            } else if (yourplay.equals(papername) && complay.equals(scissorsname)) {
                binding.natije.setText("bot win");
                binding.backgerand0.setImageResource(R.drawable.red);
            } else if (yourplay.equals(scissorsname) && complay.equals(rockname)) {
                binding.natije.setText("bot win");
                binding.backgerand0.setImageResource(R.drawable.red);
            } else if (yourplay.equals(scissorsname) && complay.equals(papername)) {
                binding.natije.setText("you win");
                binding.backgerand0.setImageResource(R.drawable.grin);
            }

            if (complay.equals(papername)) {
                Animation anim3 = AnimationUtils.loadAnimation(MainActivity.this, R.anim.fade_out);
                binding.rock.startAnimation(anim3);
                binding.rock.setImageResource(R.drawable.peper);
            } else if (complay.equals(scissorsname)) {
                Animation anim2 = AnimationUtils.loadAnimation(MainActivity.this, R.anim.fade_out);
                binding.rock.startAnimation(anim2);
                binding.rock.setImageResource(R.drawable.scissors);
            } else if (complay.equals(rockname)) {
                Animation anim1 = AnimationUtils.loadAnimation(MainActivity.this, R.anim.fade_out);
                binding.rock.startAnimation(anim1);
                binding.rock.setImageResource(R.drawable.rocks);
            }
        });




        }


    }
