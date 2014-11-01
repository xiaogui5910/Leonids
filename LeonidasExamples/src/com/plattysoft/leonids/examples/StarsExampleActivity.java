package com.plattysoft.leonids.examples;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

import com.plattysoft.leonids.ParticleSystem;
import com.plattysoft.leonids.modifiers.ScaleModifier;

public class StarsExampleActivity extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_particle_system_example);
		findViewById(R.id.button1).setOnClickListener(this);
	}

	@Override
	public void onClick(View arg0) {
		new ParticleSystem(this, 10, R.drawable.star, 3000)		
		.setSpeedByComponentsRange(-0.15f, 0.15f, -0.15f, 0.05f)
		.setAcceleration(0.00001f, 90)
		.setInitialRotationRange(0, 360)
		.setRotationSpeed(120)
		.setFadeOut(2000)
		.addModifier(new ScaleModifier(0f, 1.5f, 0, 1500))
		.oneShot(arg0, 10);
	}
}
