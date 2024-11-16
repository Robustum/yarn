package net.fabricmc.filament.task.minecraft;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

import org.gradle.api.tasks.TaskAction;

import net.fabricmc.filament.task.base.FilamentTask;
import net.fabricmc.filament.task.base.WithFileInput;
import net.fabricmc.filament.task.base.WithFileOutput;
import net.fabricmc.loom.util.FileSystemUtil;

public abstract class ExtractBundledServerTask extends FilamentTask implements WithFileOutput, WithFileInput {
	@TaskAction
	public void run() throws IOException {
		// TODO: Remove this task.
		Files.copy(getInputPath(), getOutputPath(), StandardCopyOption.REPLACE_EXISTING);
	}
}
